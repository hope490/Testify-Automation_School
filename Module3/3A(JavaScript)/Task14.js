const anotherBook ={
    title:'Automation ',
    description: 'Fundamentals of Automation',
    NumberOfpage:20,
    author:'Ebube', 
    reading:true,
toggleReadingStatus: function  (){
    this.reading = !this.reading;
    //if(book.reading==true){
    //book.reading=false
   //}else {
   // book.reading=true
  // }

}

}
book.toggleReadingStatus()
console.log(anotherBook.reading)