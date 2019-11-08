package io.github.mainstringargs.alphaVantageScraper;

import org.patriques.AlphaVantageConnector;
import org.patriques.BatchStockQuotes;
import org.patriques.TechnicalIndicators;
import org.patriques.input.technicalindicators.Interval;
import org.patriques.input.technicalindicators.SeriesType;
import org.patriques.input.technicalindicators.TimePeriod;
import org.patriques.output.AlphaVantageException;
import org.patriques.output.technicalindicators.RSI;
import org.patriques.output.technicalindicators.data.IndicatorData;

public class AlphaVantageTechnicalIndicatorsExample {
  public static void main(String[] args) {
    String apiKey = AlphaVantageAPIKey.getAPIKey();
    int timeout = 3000;
    AlphaVantageConnector apiConnector = new AlphaVantageConnector(apiKey, timeout);
    
    BatchStockQuotes qs = new BatchStockQuotes(apiConnector);
    
//    System.out.println(qs.quote("AMZN").getStockQuotes().get(0).getPrice());

//    try {
//      TechnicalIndicators ti = new TechnicalIndicators(apiConnector);
//
//      RSI rsi = ti.rsi("FE", Interval.ONE_MIN, TimePeriod.of(15), SeriesType.CLOSE);
//
//      System.out.println(rsi.getMetaData());
//
//      System.out.println("Count " + rsi.getData().size());
//
//      for (IndicatorData data : rsi.getData()) {
//        System.out.println(data.getDateTime() + " " + data.getData());
//      }
//
//    } catch (AlphaVantageException e) {
//      System.out.println("something went wrong");
//    }
  }
}
