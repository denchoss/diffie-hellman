import java.io.FileWriter;
import java.io.IOException;

public class user2 {
    communism communism=new communism();
    int p=0;//простое число P
    int a=0;//случайное число A
    long y2=0;//открытый ключ второго пользователя
    int x2=0;//закрытый ключ второго пользователя
    long y1=0;//открытый ключ первого пользователя
    int z=0;//общий секретный ключ
    public void sety1(long b){//получение открытого ключа от первого пользователя
        y1=b;
    }
    public void setp(int b){//получение числа P
        p=b;
    }
    public void seta(int b){//получение числа A
        a=b;
    }
    public long gety2(){//передача открытого ключа первому пользователю
        return y2;
    }
    public void geny2() {//генерирование открытого ключа
        while (x2 >= 5 || x2 == 0) {
            x2 = (int) (Math.random() * 10);
        }
        long t2 = (int) Math.pow(a, x2);
        y2 = t2 % p;
    }
    public void genz() {//генерирование общего ключа
        z=(int) Math.pow(y1, x2);
        z=z%p;
    }
    public void print(){//вывод имеющихся данных в файл
        try(FileWriter writer = new FileWriter("C://notes3.txt", true))
        {
            // запись всей строки
            String text = "данные 2 пользователя";
            writer.write(text+"\r\n");
            text = "          общие параметры      открытый ключ       закрытый ключ";
            writer.write(text+"\r\n");
            text = "user1       p="+p+" a="+a+"              y1="+y1+"                  z="+z;
            writer.write(text+"\r\n");
            text = "user2       p="+p+" a="+a+"              y2="+y2+"                  x2="+x2;
            writer.write(text+"\r\n");

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}