import {
  loginFailure, loginStart, loginSuccess,
  logoutStart, logoutFailure, logoutSuccess
} from "./userRedux";
import { publicRequest } from "../requestMethods";

export const login = async (dispatch, user) => {
  dispatch(loginStart());
  try {
    const res = await publicRequest.post("/auth/login", user);
    dispatch(loginSuccess(res.data));
  } catch (err) {
    console.log("Login failed", err)
    dispatch(loginFailure());
  }
};

export const logout = async (dispatch) => {
  try {
    dispatch(logoutStart())
    dispatch(logoutSuccess())
  } catch (err) {
    console.log("Logout failed", err);
    dispatch(logoutFailure());
  }
}