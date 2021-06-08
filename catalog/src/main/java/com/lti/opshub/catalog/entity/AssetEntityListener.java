package com.lti.opshub.catalog.entity;

import javax.persistence.PrePersist;
import java.util.UUID;

public class AssetEntityListener {

    @PrePersist
    public void preSavingToDBProcess(Assets asset) {
        if (null == asset.getAssetid())
            asset.setAssetid(String.valueOf(UUID.randomUUID()));

    }
}
