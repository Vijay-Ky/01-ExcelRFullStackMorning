//mouse hover
$("document").ready(function()
{
   $("#btn1").click(function()
   {
      $("#img1").hide();
   })

   $("#btn2").click(function()
   {
      $("#img1").show();
   })

   $("#btn3").click(function()
   {
      $("#img1").toggle();
   })
})