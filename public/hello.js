$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/greeting",
        dataType: 'jsonp',
        jsonp: 'callback',
    }).then(function(data, status, jqxhr) {
       $('.greeting-id').append(data.id);
       $('.greeting-content').append(data.content);
       console.log(jqxhr);
    });
    
    $.ajax({
        url: "http://localhost:8080/greeting-javaconfig",
        dataType: 'jsonp',
        jsonp: 'callback',
    }).then(function(data, status, jqxhr) {
       $('.greeting-id-2').append(data.id);
       $('.greeting-content-2').append(data.content);
       console.log(jqxhr);
    });
});
