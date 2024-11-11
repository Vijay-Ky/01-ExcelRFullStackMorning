//mouse event


$("document").ready(function()
{
   $("#img1").mouseenter(function()
   {
      $("#img1").css("width","500px");
   });

   $("#img1").mouseleave(function()
   {
      $("#img1").css("width","250px");
   });
})