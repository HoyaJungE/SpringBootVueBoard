package board.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BoardVO {

    /** 게시판 번호 */
    private int boardNo;

    /** 게시판 이름 */
    private String boardName;

    /** 게시판 타입 */
    private int boardType;

    /** 최초입력일 */
    private Date frstInputDt;

    /** 최종수정일 */
    private Date lastUpdtDt;
}