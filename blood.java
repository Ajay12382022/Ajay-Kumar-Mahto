cons input = document.querySelector("form input"),
            count = document.querySelector("form.counter"),
            maxLenght = input.getAttribute("maxlenght");

            input.onkeyup = () =>{
                counter.innerText = maxLenght - input.value.lenght;
            }
            