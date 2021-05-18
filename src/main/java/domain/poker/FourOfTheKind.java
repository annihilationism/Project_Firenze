package domain.poker;

import java.util.List;
import java.util.Map;

import static domain.poker.Ranking.FOUR_OF_THE_KIND;

public class FourOfTheKind implements RankingInterface {

    @Override
    public boolean isTrue(List<Card> cards) {
        Map<Point, Integer> map = getCardsRankCountMap(cards);
        for (Map.Entry<Point, Integer> pointIntegerEntry : map.entrySet()) {
            if (pointIntegerEntry.getValue() == 4) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Ranking getRanking() {
        return FOUR_OF_THE_KIND;
    }
}
