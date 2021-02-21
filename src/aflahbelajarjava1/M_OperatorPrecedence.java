package aflahbelajarjava1;

public class M_OperatorPrecedence {
    public static void main(String[] args){
        
        int a,b,c,d,e,f,g,h,i,r,s,t,u,v,w,x,y;
        
        a = 1;
        b = 2;
        c = 3;
        d = 4;
        e = 5;
        f = 6;
        g = 7;
        h = 8;
        i = 9;
        
        r = a;
        s = b;
        t = c;
        u = d;
        v = e;
        w = f;
        x = g;
        y = h;
        
        int hasil0 = a / b ^ c ^ d - e + f - g * h + i;
        int hasil1 = 3 * 10 * 2 / 15 - 2 + 4 ^ 2 ^ 2;
        int hasil2 = r ^ s * t / u - v + w ^ x - y++;
        
        System.out.println("Hasil dari (a / b ^ c ^ d - e + f - g * h + i) = "+hasil0);
        System.out.println("Hasil dari (3 * 10 * 2 / 15 - 2 + 4 ^ 2 ^ 2)   = "+hasil1);
        System.out.println("Hasil dari (r ^ s * t / u - v + w ^ x - y++)   = "+hasil2);
    }
}
