//scenario: user net is slow, button loads before the image, if the user presses the button then there would be a problem(there is no way we can wirte query for that), so first html should be loading before the jquery part works
//ready is basically event in jquery
$("document").ready(function()
{
   $("button").click(function()
   {
      $("#img1").css("width","250px");
   });
})