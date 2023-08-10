package reon.app.domain.member.dto.res;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import reon.app.domain.member.entity.MemberBattleInfo;

@Data
@NoArgsConstructor
public class MemberBattleInfoResponse {
    private int score; //누적점수
    private int gameCnt; //
    private int win;
    private int lose;

    public MemberBattleInfoResponse(MemberBattleInfo memberbattleInfo){
        this.score = memberbattleInfo.getScore();
        this.gameCnt=memberbattleInfo.getGameCnt();
        this.win= memberbattleInfo.getWin();
        this.lose= memberbattleInfo.getLose();
    }
}
