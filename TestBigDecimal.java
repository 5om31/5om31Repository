import java.math.BigDecimal;
import java.math.RoundingMode;

/*
 * Copyright (c) Unistar Corp. 2014. All Rights Reserved.
 * 
 * Unistar DEV Team
 */

/**
 * Title: .TestBigDecimal.java<br>
 * Description: FIXME TestBigDecimal.java Description
 * 
 * @author: hjames
 * @version: 1.0
 */
public class TestBigDecimal {

    public static void main(String[] args) {
        // BigDecimal singleBet = new BigDecimal("2");
        // BigDecimal seriesvalue = new BigDecimal("0.7");
        // BigDecimal seriesBase = new BigDecimal("1");
        //
        // BigDecimal standardBonus = new BigDecimal("2000");
        // BigDecimal bonusBase = new BigDecimal("1000");
        // BigDecimal playBonus = new BigDecimal("333.3334");

        // (LOM.SERIES + 1) / (' || drawObj.standard_bonus || ' / 1000)
        // BigDecimal finalSeriesVal = ;

        // BigDecimal x = standardBonus.divide(bonusBase);
        // System.out.println(seriesvalue.add(seriesBase).multiply(singleBet.divide(standardBonus.divide(bonusBase)).multiply(playBonus)));
        // System.out.println(singleBet.multiply(seriesvalue.add(seriesBase).divide(standardBonus.divide(bonusBase),
        // 4, RoundingMode.HALF_DOWN))
        // .multiply(playBonus));
        //
        // System.out.println(singleBet.multiply(seriesvalue.add(seriesBase).divide(standardBonus.divide(bonusBase),
        // 4, RoundingMode.HALF_DOWN)));

        BigDecimal singleBetPrice = new BigDecimal("2");
        BigDecimal bonusBase = new BigDecimal("1000");
        BigDecimal seriesBase = new BigDecimal("1");
        BigDecimal seriesPrize = new BigDecimal("1.6");
        BigDecimal basePrize = new BigDecimal("1.9800");
        BigDecimal playBonus = new BigDecimal("2.2");
        // System.out.println(seriesPrize.divide(basePrize));
        // System.out.println(seriesPrize.divide(basePrize).setScale(4));
        System.out.println(seriesPrize.divide(basePrize, 4, RoundingMode.HALF_UP).multiply(playBonus));
        System.out.println(singleBetPrice.multiply(seriesPrize.divide(basePrize, 4, RoundingMode.HALF_UP).multiply(playBonus)));
        System.out.println(singleBetPrice.multiply(seriesPrize.divide(basePrize, 5, RoundingMode.FLOOR).multiply(playBonus)).setScale(4,
                RoundingMode.FLOOR));

        System.out.println("------------------------------");
        Double singleBetPriceD = new BigDecimal("2").doubleValue();
        // Double bonusBaseD = new BigDecimal("1000").doubleValue();
        // Double seriesBaseD = new BigDecimal("1").doubleValue();
        Double seriesPrizeD = new BigDecimal("1.6").doubleValue();
        Double basePrizeD = new BigDecimal("1.9800").doubleValue();
        Double playBonusD = new BigDecimal("2.2").doubleValue();
        //
        // System.out.println(basePrizeD);
        Double result = singleBetPriceD * (seriesPrizeD / basePrizeD * playBonusD);
        System.out.println(result);
        BigDecimal finalRes = new BigDecimal(result.toString()).setScale(4, RoundingMode.FLOOR);
        System.out.println(finalRes);
    }
}
