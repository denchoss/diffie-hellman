public class communism {                           //класс общих данных для всех пользователей
    int p=0;                                       //просто ечисло p
    int a=0;                                       //случайное число A
    int l=0;
    int k=0;

    public void genp() {                           //генерирование P
        while (l == 0) {
            k = 0;
            p = (int) (Math.random() * 100);       //генерация случайного числа
            for (int i = 2; i < p; i++) {          //проверка простое ли оно
                if (p % i == 0) {
                    k = 1;
                }
            }
            if (p == 2) {                           //если сгенерировалось число 2,то оно простое
                k = 0;
            }
            if (k == 0 && p != 0) {
                l = 1;
            }
        }
    }
    public int getp(){                          //возврат числа P
        return p;
    }
    public void gena() {                        //генерирование A
        while (a <=1 || a>=(p-1) ){
            a = (int) (Math.random() * 100);    //генерация случайного числа
        }
    }
    public int geta(){                          //возврат числа A
        return a;
    }
}