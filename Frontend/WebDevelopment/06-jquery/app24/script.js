//mouse hover
$("document").ready(function()
{
   $("#btn1").click(function()
   {
      $("#img1").hide(2000);
   })

   $("#btn2").click(function()
   {
      $("#img1").show(2000);
   })

   $("#btn3").click(function()
   {
      $("#img1").toggle(2000);
   })
})