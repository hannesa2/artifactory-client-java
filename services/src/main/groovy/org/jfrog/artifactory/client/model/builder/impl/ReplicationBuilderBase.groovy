package org.jfrog.artifactory.client.model.builder.impl

import org.jfrog.artifactory.client.model.builder.ReplicationBuilder

abstract class ReplicationBuilderBase<B extends ReplicationBuilder> implements ReplicationBuilder<B> {

    protected boolean enabled;

    protected String cronExp;

    protected boolean syncDeletes;

    protected boolean syncProperties;

    protected String repoKey;

    @Override
    B enabled(boolean enabled) {
        this.enabled = enabled;

        return this;
    }

    @Override
    B cronExp(String cronExp) {
        this.cronExp = cronExp;

        return this;
    }

    @Override
    B syncDeletes(boolean syncDeletes) {
        this.syncDeletes = syncDeletes;

        return this;
    }

    @Override
    B syncProperties(boolean syncProperties) {
        this.syncProperties = syncProperties;

        return this;
    }

    @Override
    B repoKey(String repoKey) {
        this.repoKey = repoKey;

        return this;
    }
}
