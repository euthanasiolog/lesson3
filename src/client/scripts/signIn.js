/**
 * Created by piatr on 26.03.17.
 */
var id = $('#id').val();
var email = $('#eMail').val();
var password = $('#password').val();
function signIn(){$(document).ready(function () {
    $('#signIn').post('http://localhost:8080/ms.do', {'id':id, 'email':email, 'password':password}, function (data) {
        $('#regOk').append(data);
    }, 'text/html');
});}
