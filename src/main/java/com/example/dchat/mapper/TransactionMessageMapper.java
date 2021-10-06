package com.example.dchat.mapper;

import com.example.dchat.model.ChatMessage;
import com.example.blockchain.model.Transaction;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface TransactionMessageMapper {

    @Mapping(target = "amount", constant = "0")
    @Mapping(target = "fee", constant = "0")
    Transaction chatMessageToTransaction(ChatMessage chatMessage);
}
