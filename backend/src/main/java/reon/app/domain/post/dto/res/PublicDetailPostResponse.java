package reon.app.domain.post.dto.res;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import reon.app.domain.post.entity.PostComment;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
public class PublicDetailPostResponse { // 마이페이지 PUBLIC, LIKED, 투표해줘 상세 페이지에 사용
    private Long id;
    private Long memberId;
    private String nickName;
    private String profileImg;
    private String actionPath;
    private String title;
    private String content;
    private int likeCnt;
    private List<PostCommentResponse> postCommentResponses;
    private LocalDateTime createDate;

    @Builder
    public PublicDetailPostResponse(Long id, Long memberId, String nickName, String profileImg, String actionPath, String title, String content, int likeCnt, List<PostCommentResponse> postCommentResponses, LocalDateTime createDate) {
        this.id = id;
        this.memberId = memberId;
        this.nickName = nickName;
        this.profileImg = profileImg;
        this.actionPath = actionPath;
        this.title = title;
        this.content = content;
        this.likeCnt = likeCnt;
        this.postCommentResponses = postCommentResponses;
        this.createDate = createDate;
    }
}
