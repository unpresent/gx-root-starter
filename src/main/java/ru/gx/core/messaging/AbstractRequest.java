package ru.gx.core.messaging;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.time.LocalDateTime;
import java.util.Map;

@SuppressWarnings("unused")
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public abstract class AbstractRequest<B extends AbstractMessageBody>
        extends AbstractMessage<RequestHeader, B>
        implements Request<B> {

    @JsonCreator
    public AbstractRequest(
            @JsonProperty("header") @NotNull final RequestHeader header,
            @JsonProperty("body") @NotNull final B body,
            @JsonProperty("correlation") @Nullable final MessageCorrelation correlation
    ) {
        super(header, body, correlation);
    }
}
