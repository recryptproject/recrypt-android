package org.recrypt.wallet.ui.fragment.addresses_fragment.light;

import org.recrypt.wallet.R;
import org.recrypt.wallet.ui.fragment.addresses_fragment.AddressesFragment;
import org.bitcoinj.crypto.DeterministicKey;

import java.util.List;

public class AddressesFragmentLight extends AddressesFragment {
    @Override
    protected int getLayout() {
        return R.layout.fragment_addresses_light;
    }

    @Override
    public void updateAddressList(List<DeterministicKey> deterministicKeys) {
        mAddressAdapter = new AddressesAdapterLight(deterministicKeys, this);
        mRecyclerView.setAdapter(mAddressAdapter);
    }
}