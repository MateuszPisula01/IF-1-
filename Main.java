class Main {
  public static void main(String[] args) {
    int wiek = 16;
   if (wiek >=18)
   {
System.out.println("Pełnoletnia");
     
     
   }
    else 
   {
if(wiek >=16)
{
  System.out.println("Możesz pracować");
}
     else
{
System.out.println("Nie możesz nic");} 
   }

String imie= wiek>=18? "Mateusz" : "Bartek";
    System.out.println(imie);
    
  }
}