package com.mihak.jumun.menu.form;
import com.mihak.jumun.entity.Store;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.Lob;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class MenuForm {

    @NotNull(message = "카테고리를 선택해주세요.")
    private Integer categoryId;

    @NotEmpty(message = "메뉴명을 입력해주세요.")
    private String name;

    @NotNull(message = "가격을 입력해주세요.")
    private Integer price;

    @Nullable  // 일단 null 허용하게 두고 추후 수정.
    private String img;   // 이미지 url

    @Lob @Nullable
    private String description;

    private Store store;

}