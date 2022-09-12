import logo from '../../assets/img/Logo.svg'
import './styles.css'

function Header() {
    return (
        <header>
            <div className="dsmeta-logo-container">
                <img src={logo} alt="DSMeta" />
                <h1>DSMeta</h1>
                <p>
                    Desenvolvido por
                    <a href="linkedin.com/in/lucas-máximo-572b421b3">@devsuperior.ig</a>
                </p>
            </div>
        </header>
    );
}

export default Header;
