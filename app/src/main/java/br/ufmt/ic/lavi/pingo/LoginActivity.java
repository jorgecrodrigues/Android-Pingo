package br.ufmt.ic.lavi.pingo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity {

    /**
     * Campo de texto para o email.
     *
     * @type android.widget.AutoCompleteTextView
     */
    private AutoCompleteTextView mEmailView;

    /**
     *
     */
    private EditText mPasswordView;

    /**
     *
     */
    private View mProgressView;

    /**
     *
     */
    private View mLoginFormView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Campo de e-mail
        mEmailView = (AutoCompleteTextView) findViewById(R.id.email);

        // Campo de senha
        mPasswordView = (EditText) findViewById(R.id.password);

        // Botão para disparar evento de login.
        Button mSignInButton = (Button) findViewById(R.id.sign_in_button);


        mLoginFormView = findViewById(R.id.login_form);
        mProgressView = findViewById(R.id.login_progress);
    }



    /**
     * Faz a validação do campo de e-mail.
     *
     * @param email
     * @return boolean
     */
    private boolean isEmailValid(String email) {
        // ATENÇÃO! Substituir por regex.
        return email.contains("@");
    }

    /**
     * Faz a validação do campo de senha.
     *
     * @param password
     * @return boolean
     */
    private boolean isPasswordValid(String password) {
        // ATENÇÃO! Substituir por regex.
        return password.length() > 4;
    }



}

