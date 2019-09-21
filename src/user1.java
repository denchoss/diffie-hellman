import java.io.FileWriter;
import java.io.IOException;
//класс первого пользователя
public class user1 {
    communism communism=new communism();
    int p=0;                                       //простое число P
    int a=0;                                       //случайное число A
    long y1=0;                                     //открытый ключ первого пользователя
    int x1=0;                                      //закрытый ключ первого пользователя
    long y2=0;                                     //открытый ключ второго пользователя
    int z=0;                                       //общий секретный ключ
    public void sety2(long b){                     //получение открытого ключа от второго пользователя
        y2=b;
    }
    public void setp(int b){                       //получение числа P
        p=b;
    }
    public void seta(int b){                       //получение числа A
        a=b;
    }
    public long gety1(){                           //передача открытого ключа второму пользователю
        return y1;
    }
    public void geny1() {                          //генерирование открытого ключа
        while (x1 >= 5 || x1 == 0) {
            x1 = (int) (Math.random() * 10);
        }
        long t1 = (int) Math.pow(a, x1);
        y1 = t1 % p;
    }
    public void genz() {                           //генерирование общего ключа
        z=(int) Math.pow(y2, x1);
        z=z%p;
    }
    public void print(){//вывод имеющихся данных в файл
        try(FileWriter writer = new FileWriter("C://notes3.txt", true))   //вывод имеющихся данных в файл
        {
            // запись всей строки
            String text = "данные 1 пользователя";
            writer.write(text+"\r\n");
            text = "          общие параметры      открытый ключ       закрытый ключ";
            writer.write(text+"\r\n");
            text = "user1       p="+p+" a="+a+"              y1="+y1+"                  x1="+x1;
            writer.write(text+"\r\n");
            text = "user2       p="+p+" a="+a+"              y2="+y2+"                  z="+z;
            writer.write(text+"\r\n");

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}