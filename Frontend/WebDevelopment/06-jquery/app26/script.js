//mouse hover
$("document").ready(function()
{
   $("#btn1").click(function()
   {
      $("#img1").slideUp(2000);
   })

   $("#btn2").click(function()
   {
      $("#img1").slideDown(2000);
   })

   $("#btn3").click(function()
   {
      $("#img1").slideToggle(2000);
   })

   $("#btn4").click(function()
   {
      $("#img1").stop(2000);
   })
});