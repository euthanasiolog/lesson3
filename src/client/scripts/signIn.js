/**
 * Created by piatr on 26.03.17.
 */
var id = $('#id').val();
var email = $('#eMail').val();
var password = $('#password').val();
$(document).ready(function () {
    $('#signIn').post('http/localhost/', {'id':id, 'email':email, 'password':password}, function (data) {
        $('#ok').append(data);
    }, 'text');
});
