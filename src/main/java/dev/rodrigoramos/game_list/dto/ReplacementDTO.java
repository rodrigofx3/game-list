package dev.rodrigoramos.game_list.dto;

public class ReplacementDTO {

    private Integer SourceIndex;
    private Integer TargetIndex;

    public Integer getSourceIndex() {
        return SourceIndex;
    }

    public void setSourceIndex(Integer sourceIndex) {
        SourceIndex = sourceIndex;
    }

    public Integer getTargetIndex() {
        return TargetIndex;
    }

    public void setTargetIndex(Integer targetIndex) {
        TargetIndex = targetIndex;
    }
}
