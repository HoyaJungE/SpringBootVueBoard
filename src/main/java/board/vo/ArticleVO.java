package board.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ArticleVO {

    /** 게시글 번호 */
    private int articleNo;

    /** 게시글 제목 */
    private String title;

    /** 게시글 내용 */
    private String content;

    /** 작성자 아이디 */
    private String writerId;

    /** 파일 마스터 번호 */
    private int fileMasterNo;

    /** 최초입력일 */
    private Date frstInputDt;

    /** 최종수정일 */
    private Date lastUpdtDt;
}
