const Student = {
  API_BASE: '/api/student/'
};

(function($){

    const onError = function(foo) {
        alert(JSON.stringify(foo, null, 2));
    };

    const serializeForm = function serializeForm($form) {
        return $form.serializeArray().reduce(function(data, field) {
            data[field.name] = field.value;
            return data;
        }, {});
    };

    console.log("Hello from student.js");

    $('#create-student').on('submit', function createStudent(ev) {
        ev.preventDefault();

        const $form = $(ev.target);
        $.ajax({
            url: Student.API_BASE,
            type: 'POST',
            data: serializeForm($form),
            success: function onCreateSuccess() {
                window.location.href = '/';
            },
            error: onError
        });
    });

    $('#edit-student').on('submit', function editStudent(ev) {
        ev.preventDefault();
        const $form = $(ev.target);
        const studentId = $(ev.target).find('input[name="id"]').val();

        $.ajax({
            url: Student.API_BASE + studentId,
            method: 'PUT',
            data: serializeForm($form),
            success: function onEditSuccess() {
                window.location.reload();
            },
            error: onError
        })
    });


    $('.delete-student').on('click', function deleteStudent(ev) {
        const $link = $(ev.target);
        const studentId = $link.data('id');
        $.ajax({
            url: Student.API_BASE + studentId,
            type: 'DELETE',
            success: function onDeleteSuccess() {
                window.location.reload();
            },
            error: onError
        });
    })
})(jQuery);