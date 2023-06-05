"use strict"

var createError = require('http-errors');
var express = require('express');
var path = require('path');
var cookieParser = require('cookie-parser');
var lessMiddleware = require('less-middleware');
var logger = require('morgan');
const admin = require('./routes/admin');
const Blog = require("./controllers/Blog");

var indexRouter = require('./routes/index');

var app = express();

const config = require('./config')();
process.env.PORT = config.port;

// view engine setup
app.set('views', path.join(__dirname, 'templates'));
app.set('view engine', 'hbs');

app.use(logger('dev'));
app.use(express.json());
app.use(express.urlencoded({ extended: false }));
app.use(cookieParser());
app.use(lessMiddleware(path.join(__dirname, 'public')));
app.use(express.static(path.join(__dirname, 'public')));

app.use('/', indexRouter);

app.all('/admin', admin.run)
app.all("/", function (req, res, next) {
  home.run(req, res, next);
});
app.all("/blog/:id", function (req, res, next) {
  Blog.runArticle(req, res, next);
});
app.all("/blog", function (req, res, next) {
  console.log('hello from the blog')
  Blog.run(req, res, next);
});
app.all("/services", function (req, res, next) {
  Page.run("services", req, res, next);
});
app.all("/careers", function (req, res, next) {
  Page.run("careers", req, res, next);
});
app.all("/contacts", function (req, res, next) {
  Page.run("contacts", req, res, next);
});



// catch 404 and forward to error handler
app.use(function(req, res, next) {
  next(createError(404));
});

// error handler
app.use(function(err, req, res, next) {
  // set locals, only providing error in development
  res.locals.message = err.message;
  res.locals.error = req.app.get('env') === 'development' ? err : {};

  // render the error page
  res.status(err.status || 500);
  res.render('error');
});

app.listen('3000', () => {
  console.log('hello the server is online and listening')
});

module.exports = app;