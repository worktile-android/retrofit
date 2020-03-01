package com.worktile.retrofit.adapter;

import retrofit2.Call;

@SuppressWarnings("rawtypes")
public class NetworkThrowable extends Throwable {
  private Call call;

  public NetworkThrowable(Throwable t, Call call) {
    super(t == null ? "" : t.getMessage() + " " +  (call == null ? "" : call.request().url()), t);
    this.call = call;
  }

  public Call getCall() {
    return call;
  }
}
