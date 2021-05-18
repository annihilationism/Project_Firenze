package domain.poker;

import java.util.List;
import java.util.Map;
import java.util.Objects;

import static domain.poker.Ranking.FLUSH;

public class Flush implements RankingInterface {
    private List<Card> cards;

    @Override
    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    @Override
    public boolean isTrue() {
        return isSameSuit(cards);
    }

    @Override
    public RankingResult getRankingResult() {
        if (Objects.isNull(cards)) {
            return new RankingResult();
        }
        return new RankingResult(cards.get(0), FLUSH, cards);
    }
}
