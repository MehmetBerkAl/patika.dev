public class SoruIsareti {
    public class Test {

        public static void main(String args[]) {
           int a, b;
           a = 10;
           b = (a == 1) ? 20: 30;
           System.out.println( "Value of b is : " +  b );
     
           b = (a == 10) ? 20: 30;
           System.out.println( "Value of b is : " + b );
        }
     }
}

/* 
Sonuç :

Value of b is : 30

Value of b is : 20
Açıklama :

b = (a == 1) ? 20: 30; => ifadesini incelenirse, (a == 1) ? 20: 30 ifadesinden başlamak daha doğru olacaktır. a'nın 1 olması durumunda 20 değeri, a'nın 1'den farklı olması durumunda 30 değeri dönecektir. b'nin değeri buradan dönen değere göre belirlenecektir. Kodda a değeri 10 olarak verildiği için b'nin değeri 30 olarak atanmaktadır.

b = (a == 10) ? 20: 30; => ifadesi incelenirse, yine yukarıdaki açıklamaya benzer olarak a değerinin 10 olması durumunda 20, a değeri 10'dan farklı olması durumunda ise 30 değeri geriye dönecektir. Bu durumda a değeri kodda 10 olduğu için b değeri de 20 olarak atanacaktır.
*/