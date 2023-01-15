function sounds(){
    if(document.activeElement.id=="w"){
        var audio=new Audio("tom-1.mp3");
        audio.play();
        
    }
    else if(document.activeElement.id=="a"){
     var audio=new Audio("tom-2.mp3");
     audio.play();
 }
 else if(document.activeElement.id=="s"){
     var audio=new Audio("tom-3.mp3");
     audio.play();
 }
 else if(document.activeElement.id=="d"){
     var audio=new Audio("tom-4.mp3");
     audio.play();
 }
 else if(document.activeElement.id=="j"){
     var audio=new Audio("snare.mp3");
     audio.play();
 }
 else if(document.activeElement.id=="k"){
     var audio=new Audio("crash.mp3");
     audio.play();
 }
 else if(document.activeElement.id=="l"){
     var audio=new Audio("kick-bass.mp3");
     audio.play();
 }

}

 document.addEventListener("keypress",function(event){
    if(event.key=="w"){
        var audio=new Audio("tom-1.mp3");
        audio.play();
        document.getElementById("w").classList.add("add");
        setTimeout(() =>{
             document.getElementById("w").classList.remove("add")
        },200);
        
     
    }
    else if(event.key=="a"){
     var audio=new Audio("tom-2.mp3");
     audio.play();
     document.getElementById("a").classList.add("add");
        setTimeout(() =>{
             document.getElementById("a").classList.remove("add")
        },200);
 }
 else if(event.key=="s"){
     var audio=new Audio("tom-3.mp3");
     audio.play();
     document.getElementById("s").classList.add("add");
        setTimeout(() =>{
             document.getElementById("s").classList.remove("add")
        },200);
 }
 else if(event.key=="d"){
     var audio=new Audio("tom-4.mp3");
     audio.play();
     document.getElementById("d").classList.add("add");
        setTimeout(() =>{
             document.getElementById("d").classList.remove("add")
        },200);
 }
 else if(event.key=="j"){
     var audio=new Audio("snare.mp3");
     audio.play();
     document.getElementById("j").classList.add("add");
        setTimeout(() =>{
             document.getElementById("j").classList.remove("add")
        },200);
 }
 else if(event.key=="k"){
     var audio=new Audio("crash.mp3");
     audio.play();
     document.getElementById("k").classList.add("add");
        setTimeout(() =>{
             document.getElementById("k").classList.remove("add")
        },200);
 }
 else if(event.key=="l"){
     var audio=new Audio("kick-bass.mp3");
     audio.play();
     document.getElementById("l").classList.add("add");
        setTimeout(() =>{
             document.getElementById("l").classList.remove("add")
        },200);
 }

 })