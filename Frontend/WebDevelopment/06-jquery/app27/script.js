//mouse hover
$("document").ready(function()
{
   $("#btn").click(function()
   {
      $("#img").animate({
         left: '150px', opacity: '1', height: '400px', width: '400px'
      }, 2000)
   })
});