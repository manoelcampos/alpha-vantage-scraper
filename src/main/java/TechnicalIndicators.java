import com.msiops.ground.either.Either;
import parameters.technical_indicator.Function;
import parameters.technical_indicator.Interval;
import parameters.technical_indicator.SeriesType;
import parameters.technical_indicator.TimePeriod;
import response.data.technical_indicator.ResponseData;
import response.models.technical_indicator.SMA;

/**
 * Technical indicator values are updated realtime: the latest data point is derived from the current trading day of a given equity.
 */
public class TechnicalIndicators {
  private final ApiConnector apiConnector;
  /**
   * Constructs a Technical Indicator Data api endpoint with the help of an {@link ApiConnector}
   * @param apiConnector the connection to the api
   */
  public TechnicalIndicators(ApiConnector apiConnector) {
    this.apiConnector = apiConnector;
  }

//  public Either<ResponseData, Exception> sma(String symbol, Interval interval, TimePeriod timePeriod, SeriesType seriesType) {
//    return apiConnector.getRequest(symbol, Function.SMA, timePeriod, interval, seriesType)
//            .flatMap(jsonString -> JsonParser.parseJson(jsonString, new SMA()));
//  }
}