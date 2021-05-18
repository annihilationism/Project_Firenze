package domain.poker;

import java.util.List;
import java.util.Map;
import java.util.Objects;

import static domain.poker.Ranking.STRAIGHT_FLUSH;
import static domain.poker.Ranking.THREE_OF_THE_KIND;

public class ThreeOfTheKind implements RankingInterface {

    private List<Card> cards;

    @Override
    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    @Override
    public boolean isTrue() {
        Map<Point, Integer> map = getCardsRankCountMap(cards);
        for (Map.Entry<Point, Integer> pointIntegerEntry : map.entrySet()) {
            if (pointIntegerEntry.getValue() == 3) {
                return true;
            }
        }
        return false;
    }

    @Override
    public RankingResult getRankingResult() {
        if (Objects.isNull(cards)) {
            return new RankingResult();
        }
        return new RankingResult(cards.get(0), THREE_OF_THE_KIND, cards);
    }
}
