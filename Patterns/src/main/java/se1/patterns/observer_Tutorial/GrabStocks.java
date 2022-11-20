package se1.patterns.observer_Tutorial;

//https://www.youtube.com/watch?v=wiQdrH2YpT4&list=PLF206E906175C7E07&index=4

public class GrabStocks {

        public static void main(String[] args) {
            var stockGrabber = new StockGrabber();
            var observer1 = new StockObserver(stockGrabber);
            var observer2 = new StockObserver(stockGrabber);
            var observer3 = new StockObserver(stockGrabber);
            var observer4 = new StockObserver(stockGrabber);


            stockGrabber.setIbmPrice(197.00);
            stockGrabber.setAaplPrice(677.60);
            stockGrabber.setGoogPrice(676.40);


            stockGrabber.setIbmPrice(197.00);
            stockGrabber.setAaplPrice(677.60);
            stockGrabber.setGoogPrice(676.40);

            stockGrabber.unregister(observer1);

            stockGrabber.setIbmPrice(197.00);
            stockGrabber.setAaplPrice(677.60);
            stockGrabber.setGoogPrice(676.40);

            stockGrabber.unregister(observer4);
            stockGrabber.unregister(observer3);
            stockGrabber.unregister(observer2);

        }
}
