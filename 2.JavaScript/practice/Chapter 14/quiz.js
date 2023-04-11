Self-check quiz
1. Which statements below are the correct way to prepare to draw?
const canvas = document.getElementById("canvas");
const ctx = canvas.getContext("2d");
var canvas = document.getElementById("canvas");
var ctx = getContext("canvas");
var ctx = canvas.getContext("canvas");
2. What will the following code do?
<canvas id="canvas"></canvas>
<script>
var canvas = document.getElementById("canvas");
var ctx = canvas.getContext("2d");
canvas.height = 600;
canvas.width = 500;
ctx.beginPath();
ctx.fillStyle = "red";
ctx.arc(50, 50, 50, 0, Math.PI * 2);
ctx.fill();
ctx.closePath();
</script>