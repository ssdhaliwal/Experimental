<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta charset="utf-8">
        <title>Tutorial: Hello Dojo!</title>
    </head>
    <body>
        <h1 id="greeting">Hello</h1>
        <!-- configure Dojo -->
        <script>
            var dojoConfig = {
                has: {
                    'dojo-firebug': false,
                    'dojo-debug-messages': true
                },
                parseOnLoad: true,
                async: true,
                baseUrl: '.',
                waitSeconds: 5,
                packages: [
                    {name: 'dojo'},
                    {name: 'dijit'},
                    {name: 'dojox'},
                    {name: 'demo', location: '/Dojo01App/demo'}],
                map: {
                    // Instead of having to type "dojo/domReady!", we just want "ready!" instead
                    "*": {
                        ready: "dojo/domReady"
                    }
                }};
        </script>
        <!-- load Dojo -->
        <script src="//ajax.googleapis.com/ajax/libs/dojo/1.10.4/dojo/dojo.js"></script>

        <script>
            require([
                'demo/myModule', 'ready!'
            ], function (myModule) {
                myModule.setText('greeting', 'Hello Dojo!');

                setTimeout(function () {
                    myModule.restoreText('greeting');
                }, 3000);
            });
        </script>
    </body>
</html>