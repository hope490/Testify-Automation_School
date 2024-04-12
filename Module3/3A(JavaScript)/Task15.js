const myBook1={
   title:'Testers Guide ', 
   description:'Beginners Course', 
   NumberOfpage:20, 
   author:'Ebube',
   reading:true, 
   }   

const anotherBook={
    title:'Automation  ', 
    description:' Fundamentals of Automation', 
    NumberOfpage:20, 
    author:'Ebube',
    reading:false, 
    }   
const thirdBook={
    title:' core of javascript ', 
    description:' fundamentals of javascript', 
    NumberOfpage:20, 
    author:'Ebube',
    reading:true, 
    }   
        
    const booksArray = [myBook1, anotherBook, thirdBook];

    for (let i = 0; i < booksArray.length; i++) {
        const currentBook = booksArray[i];
        if (currentBook.reading === true) {
            console.log(currentBook.title + ' is being read');
        } else {
            console.log(currentBook.title + ' is not being read');
        }
    }



    for (let book = 0; book < booksArray; book++) {
        const currentBook = booksArray[book];
        if (currentBook.reading === true) {
            console.log(currentBook.title + ' is being read');
        } else {
            console.log(currentBook.title + ' is not being read');
        }
    }