package com.optimization.data.optimizer.service.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class SlotDTO {
    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    private LocalDateTime time;

    public SlotDTO(LocalDateTime time) {
        this.time = time;
    }

    public SlotDTO() {}

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
