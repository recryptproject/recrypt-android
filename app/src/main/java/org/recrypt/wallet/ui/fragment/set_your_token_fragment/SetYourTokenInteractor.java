package org.recrypt.wallet.ui.fragment.set_your_token_fragment;

import org.recrypt.wallet.model.contract.ContractMethod;

public interface SetYourTokenInteractor {
    ContractMethod getContractConstructor(String uiid);
}
