public class Exercise4_2 {

    public static void main(String[] args) {
        zippo("rattle", 13);          // 1
    }

    public static void baffle(String blimp) {
        System.out.println(blimp);    // 5
        zippo("ping", -5);            // 6
    }

    public static void zippo(String quince, int flag) {
        if (flag < 0) {               // 7
            System.out.println(quince + " zoop "); // 8
        } else {
            System.out.println("ik"); // 3
            baffle(quince);          // 4
            System.out.println("boo -wa -ha -ha"); // 9
        }
    }
}

/*
Calisma sirasi (statement bazinda):

1) main icindeki zippo("rattle", 13);        --> line 4 yorumunda // 1
2) zippo icindeki if (flag < 0)              --> // 7 (ilk cagri icin kosul degerlendirme)
   (flag = 13 oldugu icin else blogu calisir)
3) System.out.println("ik");                 --> // 3
4) baffle(quince);                           --> // 4
5) baffle icindeki System.out.println(blimp) --> // 5
6) baffle icindeki zippo("ping", -5);        --> // 6
7) ikinci zippo cagrisinda if (flag < 0)     --> // 7 (ikinci kez)
8) System.out.println(quince + " zoop ");    --> // 8
9) ilk zippo cagrisinda else bloguna geri donulur ve
   System.out.println("boo -wa -ha -ha");    --> // 9

Programin ciktisi (satir satir, spacing yaklasik):

ik
rattle
ping zoop 
boo -wa -ha -ha
*/
