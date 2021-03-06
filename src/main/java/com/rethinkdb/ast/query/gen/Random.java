package com.rethinkdb.ast.query.gen;

import com.rethinkdb.ast.query.RqlQuery;
import com.rethinkdb.proto.Q2L;

import java.util.List;
import java.util.Map;

// extends RqlTopLevelQuery
public class Random extends RqlQuery {

    public Random(List<Object> args, java.util.Map<String, Object> optionalArgs) {
        this(null, args, optionalArgs);
    }

    public Random(RqlQuery prev, List<Object> args, Map<String, Object> optionalArgs) {
        super(prev, Q2L.Term.TermType.RANDOM, args, optionalArgs);
    }
}
        