//mouse hover
$("document").ready(function()
{
   $("#btn1").click(function()
   {
      $("#img1").fadeIn(2000);
   })

   $("#btn2").click(function()
   {
      $("#img1").fadeOut(2000);
   })

   $("#btn3").click(function()
   {
      $("#img1").fadeToggle(2000);
   })
});