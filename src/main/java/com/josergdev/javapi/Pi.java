package com.josergdev.javapi;

import java.math.BigInteger;

public class Pi {
    final BigInteger TWO = BigInteger.valueOf(2) ;
    final BigInteger THREE = BigInteger.valueOf(3) ;
    final BigInteger FOUR = BigInteger.valueOf(4) ;
    final BigInteger SEVEN = BigInteger.valueOf(7) ;

    BigInteger q = BigInteger.ONE ;
    BigInteger r = BigInteger.ZERO ;
    BigInteger t = BigInteger.ONE ;
    BigInteger k = BigInteger.ONE ;
    BigInteger n = BigInteger.valueOf(3) ;
    BigInteger l = BigInteger.valueOf(3) ;

    public String calcPiDigits(int nDigits){
        String result = "";
        BigInteger cnt = BigInteger.ZERO;
        BigInteger nn, nr ;

        boolean first = true ;
        if(BigInteger.valueOf(nDigits).compareTo(BigInteger.ONE) == -1){return result ;}
        while(true){
            if(FOUR.multiply(q).add(r).subtract(t).compareTo(n.multiply(t)) == -1){
                cnt = cnt.add(BigInteger.ONE);
                result += n;
                if(cnt.compareTo(BigInteger.valueOf(nDigits)) == 0){return result ;}

                if(first){result += "." ; first = false ;}
                nr = BigInteger.TEN.multiply(r.subtract(n.multiply(t))) ;
                n = BigInteger.TEN.multiply(THREE.multiply(q).add(r)).divide(t).subtract(BigInteger.TEN.multiply(n)) ;
                q = q.multiply(BigInteger.TEN) ;
                r = nr ;
            }else{
                nr = TWO.multiply(q).add(r).multiply(l) ;
                nn = q.multiply((SEVEN.multiply(k))).add(TWO).add(r.multiply(l)).divide(t.multiply(l)) ;
                q = q.multiply(k) ;
                t = t.multiply(l) ;
                l = l.add(TWO) ;
                k = k.add(BigInteger.ONE) ;
                n = nn ;
                r = nr ;
            }
        }
    }

}