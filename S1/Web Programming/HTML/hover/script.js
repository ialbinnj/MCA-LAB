let hoverText=document.querySelector('.hovered');
let hoverContent=document.querySelector('.hover-content')

hoverText.addEventListener('mouseover',()=>{
  hoverContent.style.display='block'
})

hoverText.addEventListener('mouseout',()=>{
  hoverContent.style.display='none'
})
