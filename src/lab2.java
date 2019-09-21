public class lab2 {
    public static void main( String[] args){
        communism communism=new communism();
        communism.genp();                  //генерирование случайного простого числа P
        communism.gena();                  //генерирование случайного числа A
        user1 user1=new user1();
        user1.setp(communism.getp());      //передача числа P первому пользователю
        user1.seta(communism.geta());      //передача числа A первому пользователю
        user1.geny1();                     //генерирование открытого ключа первого пользователя
        user2 user2=new user2();
        user2.setp(communism.getp());      //передача числа P второму пользователю
        user2.seta(communism.geta());      //передача числа A второму пользователю
        user2.geny2();                     //генерирование закрытого ключа первого пользователя
        user1.sety2(user2.gety2());        //передача открытого ключа второго пользователя первому
        user2.sety1(user1.gety1());        //передача открытого ключа первого пользователя второму
        user1.genz();                      //генерирование общего ключа первым пользователем
        user2.genz();                      //генерирование общего ключа первым пользователем
        user1.print();                     //вывод имеющихся данных у первого пользователя
        user2.print();                     //вывод имеющихся данных у второго пользователя
    }
}