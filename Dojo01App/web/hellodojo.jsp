<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta charset="utf-8">
        <title>Tutorial: Hello Dojo!</title>
    </head>
    <body>
        <div id="headerDiv">
            <h1 id="greeting">Hello</h1>  
        </div>
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
                'dojo/on', 'dojo/dom', 'dojo/dom-style', 'dojo/mouse', 'demo/myModule', 'ready!'
            ], function (myModule) {
                var myHeader = dom.byId('greeting');
                
                myModule.setText('greeting', 'Hello Dojo!');

                setTimeout(function () {
                    myModule.restoreText('greeting');
                }, 3000);
            });
        </script>
    </body>
</html>